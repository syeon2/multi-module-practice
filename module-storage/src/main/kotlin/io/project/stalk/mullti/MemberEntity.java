package io.project.stalk.mullti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class MemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;

	public MemberEntity() {
	}

	public MemberEntity(Long id, String firstName) {
		this.id = id;
		this.firstName = firstName;
	}

}
