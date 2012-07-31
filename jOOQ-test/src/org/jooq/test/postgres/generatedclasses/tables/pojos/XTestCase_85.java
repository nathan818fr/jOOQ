/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_85", schema = "public")
public class XTestCase_85 implements java.io.Serializable {

	private static final long serialVersionUID = -2073807823;

	private final java.lang.Integer id;
	private final java.lang.Integer xUnusedId;
	private final java.lang.String  xUnusedName;

	public XTestCase_85(
		java.lang.Integer id,
		java.lang.Integer xUnusedId,
		java.lang.String  xUnusedName
	) {
		this.id = id;
		this.xUnusedId = xUnusedId;
		this.xUnusedName = xUnusedName;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return this.id;
	}

	@javax.persistence.Column(name = "x_unused_id", precision = 32)
	public java.lang.Integer getXUnusedId() {
		return this.xUnusedId;
	}

	@javax.persistence.Column(name = "x_unused_name", length = 10)
	public java.lang.String getXUnusedName() {
		return this.xUnusedName;
	}
}
