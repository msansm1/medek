package com.devoteam.springhibernate.utils;

import org.apache.log4j.Logger;

public class FilterUtil {

	private static Logger logger = Logger.getLogger(FilterUtil.class);

	public static enum WhereType {
		like, isnull, notnull, equal;
	}

	/**
	 * filters is an array which contains fields' names to be treated
	 * 
	 * @param filters
	 * @param table
	 * @param where
	 *            where clause to use. Possibles values: "like", "null"
	 * @return
	 */
	public static String getSQLFromSimpleFilter(String filter,
			String[] filters, String table, WhereType where, boolean start) {
		logger.debug("getSQLFromSimpleFilter, filters : " + filters);
		
		StringBuffer res = new StringBuffer();
		boolean first = start;
		String value;
		
		for (String flt : filters) {
			logger.debug("  => flt : "+flt);
			value = getFilterValue(filter, flt);
			if (value == null) {
				continue;
			}
			if (first) {
				first = false;
				res.append(" WHERE ");
			} else {
				res.append(" AND ");
			}

			res.append(table);
			res.append(".");
			res.append(flt);
			res.append(" ");

			switch (where) {
			case like:
				res.append("LIKE '%");
				if (value.contains("'")) {
					value = value.replaceAll("'", "%");
				}
				res.append(value);
				res.append("%'");
				break;

			case isnull:
				res.append("IS NULL");
				break;

			case notnull:
				res.append("IS NOT NULL");
				break;

			case equal:
				res.append("='");
				res.append(value);
				res.append("'");
				break;

			default:
				logger.warn(", unknown where clause: " + where);
				return "";
			}
			logger.debug("    == res : "+res.toString());
		}

		logger.debug("getSQLFromSimpleFilter, where = " + res.toString());
		return res.toString();
	}

	public static String getSQLFromFilter(String filter, String table) {
		logger.debug("ANALYZING filter : " + filter);
		String res = "";
		filter = filter.substring(filter.indexOf("groupOp") + 10);
		String op = filter.substring(0, filter.indexOf('"'));
		logger.debug("    - op : " + op);
		filter = filter.substring(filter.indexOf("rules") + 8);
		logger.debug("    - rules : " + filter);
		boolean first = true;
		while (!filter.startsWith("]")) {
			String rule = filter.substring(filter.indexOf('{') + 1,
					filter.indexOf('}'));
			if (rule.substring(0, rule.indexOf(',')).contains("name") ||
					rule.substring(0, rule.indexOf(',')).contains("mail")) {
				filter = filter.substring(filter.indexOf('}') + 1);
				continue;
			}
			logger.debug("       - rule : " + rule);
			if (first) {
				first = false;
				res = " WHERE ";
			} else {
				res += " " + op + " ";
			}
			rule = rule.substring(rule.indexOf(':') + 2);
			res += table + "." + rule.substring(0, rule.indexOf('"'));
			logger.debug("          - field : "
					+ rule.substring(0, rule.indexOf('"')));
			rule = rule.substring(rule.indexOf(',') + 1);
			rule = rule.substring(rule.indexOf(':') + 2);
			// op ???
			rule = rule.substring(rule.indexOf(',') + 1);
			rule = rule.substring(rule.indexOf(':') + 2);
			res += " LIKE '%";
			String val = rule.substring(0, rule.indexOf('"'));
			if (val.contains("'")) {
				val = val.replaceAll("'", "%");
			}
			res += val;
			logger.debug("          - data : "
					+ rule.substring(0, rule.indexOf('"')));
			res += "%'";
			filter = filter.substring(filter.indexOf('}') + 1);
		}
		logger.debug("  where result : " + res);
		return res;
	}
	
	private static String getFilterValue(String filter, String key) {
		String flt = filter;
		flt = flt.substring(flt.indexOf("rules") + 8);
		while (!flt.startsWith("]")) {
			String rule = flt.substring(flt.indexOf('{') + 1,
					flt.indexOf('}'));
			logger.debug("       - rule : " + rule);
			rule = rule.substring(rule.indexOf(':') + 2);
			logger.debug("          - field : "
					+ rule.substring(0, rule.indexOf('"')));
			if (rule.substring(0, rule.indexOf('"')).equals(key)) {
				rule = rule.substring(rule.indexOf(',') + 1);
				rule = rule.substring(rule.indexOf(':') + 2);
				// op ???
				rule = rule.substring(rule.indexOf(',') + 1);
				rule = rule.substring(rule.indexOf(':') + 2);
	
				logger.debug("          - data : "
						+ rule.substring(0, rule.indexOf('"')));
				return rule.substring(0, rule.indexOf('"'));
			}
			flt = flt.substring(flt.indexOf('}') + 1);
		}
		return null;
	}
}
