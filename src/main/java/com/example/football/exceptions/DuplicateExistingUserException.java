/*******************************************************************************
 * COPYRIGHT (c) 2018 BY DXC TECHNOLOGY COMPANY. 
 * ALL RIGHTS RESERVED WORLDWIDE. THIS SOFTWARE PRODUCT HAS BEEN
 * PROVIDED PURSUANT TO AN AGREEMENT CONTAINING RESTRICTIONS ON 
 * ITS USE. IT MAY NOT BE COPIED, DUPLICATED, SOLD OR OTHERWISE
 * DISTRIBUTED IN ANY FORM OR BY ANY THIRD PARTIES WITHOUT THE
 * PRIOR WRITTEN PERMISSION OF DXC TECHNOLOGY COMPANY. 
 *******************************************************************************/
package com.example.football.exceptions;

public class DuplicateExistingUserException extends Exception {

	private static final long serialVersionUID = -6480246492793072178L;
	

	public DuplicateExistingUserException(String s) {
		super(s);
	}

}
