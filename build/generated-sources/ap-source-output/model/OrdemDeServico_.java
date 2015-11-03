package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdemDeServico.class)
public abstract class OrdemDeServico_ {

	public static volatile SingularAttribute<OrdemDeServico, OrdemStatus> ordemstatusid;
	public static volatile SingularAttribute<OrdemDeServico, String> responsavelExecucao;
	public static volatile SingularAttribute<OrdemDeServico, Date> dataExecucao;
	public static volatile SingularAttribute<OrdemDeServico, Intendencia> intendenciaid;
	public static volatile ListAttribute<OrdemDeServico, Incidente> incidenteList;
	public static volatile SingularAttribute<OrdemDeServico, Integer> id;
	public static volatile SingularAttribute<OrdemDeServico, Date> dataCriacao;
	public static volatile SingularAttribute<OrdemDeServico, Usuario> usuarioid;

}

