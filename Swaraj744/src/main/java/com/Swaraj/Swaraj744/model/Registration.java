package com.Swaraj.Swaraj744.model;
import com.Swaraj.Swaraj744.enumtype.SeedType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = jakarta.persistence.CascadeType.ALL)
	private User user;

	@jakarta.validation.constraints.NotNull
	@ManyToOne
	private Component component;

	@Enumerated(EnumType.STRING)
	private SeedType seedType;

	@jakarta.validation.constraints.NotNull
	private Double acres;

	@jakarta.validation.constraints.NotNull
	private Integer pots;

	private Double totalPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	public SeedType getSeedType() {
		return seedType;
	}

	public void setSeedType(SeedType seedType) {
		this.seedType = seedType;
	}

	public Double getAcres() {
		return acres;
	}

	public void setAcres(Double acres) {
		this.acres = acres;
	}

	public Integer getPots() {
		return pots;
	}

	public void setPots(Integer pots) {
		this.pots = pots;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
