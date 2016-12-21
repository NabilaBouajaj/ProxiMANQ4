package org.formation.dao.impl;

import javax.persistence.Entity;

import org.formation.dao.IVirementDao;
import org.formation.model.Virement;
import org.springframework.stereotype.Repository;

@Repository
@Entity
public class VirementDaoImpl extends EntityDaoImpl<Virement> implements IVirementDao {

}
