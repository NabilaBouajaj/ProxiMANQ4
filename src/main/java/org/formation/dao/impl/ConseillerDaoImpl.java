package org.formation.dao.impl;

import org.formation.dao.IConseillerDao;
import org.formation.model.Conseiller;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ConseillerDaoImpl extends EntityDaoImpl<Conseiller> implements IConseillerDao {

}
