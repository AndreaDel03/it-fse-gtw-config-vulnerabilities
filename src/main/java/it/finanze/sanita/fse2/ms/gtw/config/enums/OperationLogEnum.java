/*
 * SPDX-License-Identifier: AGPL-3.0-or-later
 * 
 * Copyright (C) 2023 Ministero della Salute
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package it.finanze.sanita.fse2.ms.gtw.config.enums;


import lombok.Getter;

public enum OperationLogEnum implements ILogEnum {

	ADD_CONFIG_PROPERTIES("ADD-PROPS", "Adding Configuration properties to the gtw-config-db"),
	REMOVE_CONFIG_PROPERTIES("REMOVE-PROPS", "Removing Configuration properties from the gtw-config-db"),
	UPDATE_CONFIG_PROPERTIES("UPDATE-PROPS", "Updating Configuration properties from the gtw-config-db");

	@Getter
	private String code;

	@Getter
	private String description;

	private OperationLogEnum(String inCode, String inDescription) {
		code = inCode;
		description = inDescription;
	}

}
