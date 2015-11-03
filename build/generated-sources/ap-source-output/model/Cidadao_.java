package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cidadao.class)
public abstract class Cidadao_ {

	public static volatile SingularAttribute<Cidadao, String> telefone;
	public static volatile SingularAttribute<Cidadao, String> endereco;
	public static volatile SingularAttribute<Cidadao, String> cpf;
	public static volatile SingularAttribute<Cidadao, Intendencia> intendenciaid;
	public static volatile ListAttribute<Cidadao, Incidente> incidenteList;
	public static volatile SingularAttribute<Cidadao, String> nome;
	public static volatile SingularAttribute<Cidadao, Integer> id;
	public static volatile SingularAttribute<Cidadao, String> email;

}

