package io.project.stalk.mullti;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class MemberRepositoryImpl implements MemberRepositoryCustom {

	private final JPAQueryFactory queryFactory;

	@Transactional
	public Optional<Long> updateMember(Long id, String name) {
		long updatedId = queryFactory.update(QMemberEntity.memberEntity)
			.set(QMemberEntity.memberEntity.firstName, name)
			.where(QMemberEntity.memberEntity.id.eq(id))
			.execute();

		return Optional.of(updatedId);
	}
}
