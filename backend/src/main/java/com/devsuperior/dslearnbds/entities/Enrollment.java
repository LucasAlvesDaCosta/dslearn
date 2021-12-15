package com.devsuperior.dslearnbds.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entities.pk.EnrollmentPk;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {
	
	@EmbeddedId
	private EnrollmentPk id = new EnrollmentPk();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean available;
	private boolean onlyUpdate;
	
	public Enrollment() {
		
	}

	public Enrollment(User user, Offer offer, Instant enrollment, Instant refundMoment, boolean available,
			boolean onlyUpdate) {
		super();
		id.setUser(user);
		id.setOffer(offer);
		this.enrollment = enrollment;
		this.refundMoment = refundMoment;
		this.available = available;
		this.onlyUpdate = onlyUpdate;
	}

	public User getStudent() {
		return id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}
	
	public Instant getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Instant enrollment) {
		this.enrollment = enrollment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	
}
