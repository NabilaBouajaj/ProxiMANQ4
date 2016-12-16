package org.formation.dao.impl;

import org.formation.dao.IClientDao;
import org.formation.model.Client;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ClientDaoimpl extends EntityDaoImpl< Client> implements IClientDao{
	
}
