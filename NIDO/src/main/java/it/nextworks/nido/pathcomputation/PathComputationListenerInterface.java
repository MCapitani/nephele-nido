
/*
 * Nextworks S.r.l.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package it.nextworks.nido.pathcomputation;

import it.nextworks.nido.common.enums.OperationResult;
import it.nextworks.nido.common.exceptions.EntityNotFoundException;
import it.nextworks.nido.path.InterDomainPath;

public interface PathComputationListenerInterface {

	public void notifyPathComputationResult(String interDomainPathId,
			OperationResult result,
			InterDomainPath path) throws EntityNotFoundException;
	
}
