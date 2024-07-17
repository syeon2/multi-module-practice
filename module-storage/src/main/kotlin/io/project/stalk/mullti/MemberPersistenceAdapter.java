package io.project.stalk.mullti;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.project.stalk.multi.ServiceTestRepository;

@Repository
public class MemberPersistenceAdapter implements ServiceTestRepository {

	private final MemberRepository memberRepository;

	@Autowired
	public MemberPersistenceAdapter(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	@NotNull
	@Override
	public String testing() {
		memberRepository.save(new MemberEntity(1L, "good!!"));
		return "good";
	}
}
