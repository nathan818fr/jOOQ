/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_785", schema = "public")
public class T_785 implements java.io.Serializable {

	private static final long serialVersionUID = -2062012599;

	private final java.lang.Integer id;
	private final java.lang.String  name;
	private final java.lang.String  value;

	public T_785(
		java.lang.Integer id,
		java.lang.String  name,
		java.lang.String  value
	) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	@javax.persistence.Column(name = "id", precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getName() {
		return this.name;
	}

	@javax.persistence.Column(name = "value", length = 50)
	public java.lang.String getValue() {
		return this.value;
	}
}
