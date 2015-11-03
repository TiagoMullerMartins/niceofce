package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Incidente.class)
public abstract class Incidente_ {

	public static volatile SingularAttribute<Incidente, Prioridade> prioridadeid;
	public static volatile SingularAttribute<Incidente, OrdemDeServico> ordemdeservicoid;
	public static volatile SingularAttribute<Incidente, Integer> id;
	public static volatile SingularAttribute<Incidente, Date> dataCriacao;
	public static volatile SingularAttribute<Incidente, Usuario> usuarioid;
	public static volatile ListAttribute<Incidente, Cidadao> cidadaoList;
	public static volatile SingularAttribute<Incidente, String> descricao;
	public static volatile SingularAttribute<Incidente, Rua> rua;

}

