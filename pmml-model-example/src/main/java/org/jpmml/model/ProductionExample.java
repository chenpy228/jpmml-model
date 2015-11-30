/*
 * Copyright (c) 2014 Villu Ruusmann
 */
package org.jpmml.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import com.beust.jcommander.Parameter;
import org.dmg.pmml.PMML;

abstract
public class ProductionExample extends Example {

	@Parameter (
		names = {"--output"},
		description = "Output PMML file",
		required = true
	)
	private File output = null;


	abstract
	public PMML produce();

	@Override
	public void execute() throws Exception {
		Marshaller marshaller = createMarshaller();

		PMML pmml = produce();

		try(OutputStream os = new FileOutputStream(this.output)){
			Result result = new StreamResult(os);

			marshaller.marshal(pmml, result);
		}
	}
}