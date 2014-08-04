package org.willowlms.util;

import java.util.Properties;
import javax.inject.Inject;

public class HtmlBuilder {
public static final String HtmlHead = "<!DOCTYPE html>\n<html><head>";
public static final String title = "<title>";

public HtmlBuilder()
{
}

@Inject
public Properties config;
}