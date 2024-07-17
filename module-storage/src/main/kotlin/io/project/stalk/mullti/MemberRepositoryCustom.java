package io.project.stalk.mullti;

import java.util.Optional;

public interface MemberRepositoryCustom {

	Optional<Long> updateMember(Long id, String name);
}
