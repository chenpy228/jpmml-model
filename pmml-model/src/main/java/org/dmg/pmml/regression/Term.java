/*
 * Copyright (c) 2013 Villu Ruusmann
 */
package org.dmg.pmml.regression;

import javax.xml.bind.annotation.XmlTransient;

import org.dmg.pmml.HasName;
import org.dmg.pmml.PMMLObject;

@XmlTransient
abstract
public class Term extends PMMLObject implements HasName<Term> {

	abstract
	public Number getCoefficient();

	abstract
	public Term setCoefficient(Number coefficient);
}