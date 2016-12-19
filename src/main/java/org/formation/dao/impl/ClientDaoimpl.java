package org.formation.dao.impl;

import org.formation.dao.IClientDao;
import org.formation.model.Client;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ClientDaoimpl extends EntityDaoImpl< Client> implements IClientDao{
	
}
