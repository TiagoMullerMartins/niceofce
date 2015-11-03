package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdemStatus.class)
public abstract class OrdemStatus_ {

	public static volatile ListAttribute<OrdemStatus, OrdemDeServico> ordemDeServicoList;
	public static volatile SingularAttribute<OrdemStatus, Integer> id;
	public static volatile SingularAttribute<OrdemStatus, String> status;

}

