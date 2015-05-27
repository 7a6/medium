package org.sevenasix.medium.util.converters;

import org.springframework.core.convert.converter.Converter;

import java.util.List;

/**
 * Generic parser interface. Parsers are used, for instance, for localization of profile data such as names and forms
 * of address, and for location data, such as city/state/province, etc.
 * Created by matt on 1/17/15.
 */
public interface NameParser extends Converter<String, List<String>> {
}
