package org.formation.dao.impl;

import org.formation.dao.IConseillerDao;
import org.formation.model.Conseiller;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ConseillerDaoImpl extends EntityDaoImpl<Conseiller> implements IConseillerDao {

}
