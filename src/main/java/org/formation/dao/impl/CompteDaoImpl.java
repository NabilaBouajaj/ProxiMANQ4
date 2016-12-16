package org.formation.dao.impl;

import org.formation.dao.ICompteDao;
import org.formation.model.Compte;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CompteDaoImpl extends EntityDaoImpl<Compte> implements ICompteDao {

}
