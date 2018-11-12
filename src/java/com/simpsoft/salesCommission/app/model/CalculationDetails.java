package com.simpsoft.salesCommission.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "CalculationDetails")
public class CalculationDetails {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "compensationAmount")
	private  double compensationAmount;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "ORDER_LINE_ITEMS_SPLIT_ID")
	private OrderLineItemsSplit itemsSplit;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name = "successFlag", nullable = false)
	private  boolean successFlag;
	
	@Column(name = "ruleOutput")
	private  String ruleOutput;
	
	@Column(name = "baseRuleOutputForRank")
	private  String baseRuleOutputForRank;
	
	public CalculationDetails() {
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the compensationAmount
	 */
	public double getCompensationAmount() {
		return compensationAmount;
	}

	/**
	 * @param compensationAmount the compensationAmount to set
	 */
	public void setCompensationAmount(double compensationAmount) {
		this.compensationAmount = compensationAmount;
	}

	/**
	 * @return the successFlag
	 */
	public boolean isSuccessFlag() {
		return successFlag;
	}

	/**
	 * @param successFlag the successFlag to set
	 */
	public void setSuccessFlag(boolean successFlag) {
		this.successFlag = successFlag;
	}

	/**
	 * @return the ruleOutput
	 */
	public String getRuleOutput() {
		return ruleOutput;
	}

	/**
	 * @param ruleOutput the ruleOutput to set
	 */
	public void setRuleOutput(String ruleOutput) {
		this.ruleOutput = ruleOutput;
	}

	public String getBaseRuleOutputForRank() {
		return baseRuleOutputForRank;
	}

	public void setBaseRuleOutputForRank(String baseRuleOutputForRank) {
		this.baseRuleOutputForRank = baseRuleOutputForRank;
	}
	
	public OrderLineItemsSplit getItemsSplit() {
		return itemsSplit;
	}

	public void setItemsSplit(OrderLineItemsSplit itemsSplit) {
		this.itemsSplit = itemsSplit;
	}
	
}
