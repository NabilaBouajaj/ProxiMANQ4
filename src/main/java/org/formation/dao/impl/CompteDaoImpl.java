package org.formation.dao.impl;

import org.formation.dao.ICompteDao;
import org.formation.model.Compte;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CompteDaoImpl extends EntityDaoImpl<Compte> implements ICompteDao {

}
