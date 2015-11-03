package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rua.class)
public abstract class Rua_ {

	public static volatile SingularAttribute<Rua, RuaPK> ruaPK;
	public static volatile ListAttribute<Rua, Incidente> incidenteList;
	public static volatile SingularAttribute<Rua, TipoRua> tiporuaid;
	public static volatile SingularAttribute<Rua, String> descricao;
	public static volatile SingularAttribute<Rua, Intendencia> intendencia;

}

