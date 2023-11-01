package jpa.entitymodels;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "studentcourses")
public class StudentCourse {
	
	public StudentCourse() {
		
	}
	
	public StudentCourse(Integer sId, Integer cId, Student student, Course course) {
		this.sId = sId;
		this.cId = cId;
		this.student = student;
		this.course = course;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private @Getter @Setter Integer scId;
	
	@Column(name = "sId", insertable=false, updatable=false)
	private @Getter @Setter Integer sId;
	
	@Column(name = "cId", insertable=false, updatable=false)
	private @Getter @Setter Integer cId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "sId", nullable = false)
	private @Getter @Setter Student student;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cId", nullable = false)
	private @Getter @Setter Course course;
	

}
