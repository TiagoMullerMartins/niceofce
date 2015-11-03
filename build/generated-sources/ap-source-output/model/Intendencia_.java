package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Intendencia.class)
public abstract class Intendencia_ {

	public static volatile ListAttribute<Intendencia, Rua> ruaList;
	public static volatile ListAttribute<Intendencia, OrdemDeServico> ordemDeServicoList;
	public static volatile SingularAttribute<Intendencia, Integer> quantidadeDeHabitantes;
	public static volatile SingularAttribute<Intendencia, Integer> kmDeExtencao;
	public static volatile SingularAttribute<Intendencia, String> nome;
	public static volatile SingularAttribute<Intendencia, Integer> id;
	public static volatile SingularAttribute<Intendencia, Integer> areaAbrangida;
	public static volatile ListAttribute<Intendencia, Cidadao> cidadaoList;

}

