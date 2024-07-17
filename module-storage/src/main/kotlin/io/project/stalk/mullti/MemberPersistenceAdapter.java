package io.project.stalk.mullti;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import io.project.stalk.multi.ServiceTestRepository;

@Repository
public class MemberPersistenceAdapter implements ServiceTestRepository {

	List<String> hello = new ArrayList<>();

	@NotNull
	@Override
	public String testing() {
		hello.add("hello");

		return hello.get(0);
	}
}
