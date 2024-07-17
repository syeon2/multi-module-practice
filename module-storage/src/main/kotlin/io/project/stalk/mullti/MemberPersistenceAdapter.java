package io.project.stalk.mullti;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import io.project.stalk.multi.ServiceTestRepository;

@Repository
public class MemberPersistenceAdapter implements ServiceTestRepository {

	private final MemberRepository memberRepository;
	private final Environment env;

	@Autowired
	public MemberPersistenceAdapter(MemberRepository memberRepository, Environment env) {
		this.memberRepository = memberRepository;
		this.env = env;
	}

	@NotNull
	@Override
	public String testing() {
		System.out.println(env.getProperty("testing.hello"));
		System.out.println(env.getProperty("maintest.hello"));
		System.out.println(env.getProperty("testing.test"));
		memberRepository.save(new MemberEntity(null,"good!!"));
		return "good";
	}

	@Nullable
	@Override
	public Long testing(long id, @NotNull String name) {
		Optional<Long> l = memberRepository.updateMember(id, name);

		return l.orElse(null);
	}
}
