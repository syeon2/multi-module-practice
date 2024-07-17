package io.project.stalk.mullti;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;
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
}
