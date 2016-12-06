package com.apress.springrecipes.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="sequenceService")
public class SequenceService {
	
	@Autowired
	private SequenceDao sequenceDao;
	
	public SequenceDao getSequenceDao() {
		return sequenceDao;
	}
	public SequenceService() {
	}	
	public String generate(String sequenceId){
		Sequence sequence = sequenceDao.getSequence(sequenceId);
		int value = sequenceDao.getNextValue( sequenceId );
		return "PRFX=>"+sequence.getPrefix() + "=VALUE=>" + value + "=SUFFIX=>" + sequence.getSuffix();
	}
}