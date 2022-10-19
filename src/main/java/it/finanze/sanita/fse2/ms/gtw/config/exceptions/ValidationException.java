/*
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */
package it.finanze.sanita.fse2.ms.gtw.config.exceptions;

/**
 * Exception that handles validation errors.
 * 
 * @author Simone Lungarella
 */
public class ValidationException extends RuntimeException {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 4420710371354323215L;

	/**
	 * Message constructor.
	 * 
	 * @param msg Message to be shown.
	 */
	public ValidationException(final String msg) {
		super(msg);
	}

	/**
	 * Complete constructor.
	 * 
	 * @param msg Message to be shown.
	 * @param e   Exception to be shown.
	 */
	public ValidationException(final String msg, final Exception e) {
		super(msg, e);
	}

	/**
	 * Exception constructor.
	 * 
	 * @param e Exception to be shown.
	 */
	public ValidationException(final Exception e) {
		super(e);
	}

}
