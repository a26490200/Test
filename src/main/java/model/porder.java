package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="porder")
public class porder {

@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer p1;
	private Integer p2;
	private Integer p3;
	private Integer p4;
	private Integer sum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Integer getP3() {
		return p3;
	}
	public void setP3(Integer p3) {
		this.p3 = p3;
	}
	public Integer getP4() {
		return p4;
	}
	public void setP4(Integer p4) {
		this.p4 = p4;
	}
	public Integer getSum() {
		sum=(p1+p2+p3+p4)*50;
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
}
