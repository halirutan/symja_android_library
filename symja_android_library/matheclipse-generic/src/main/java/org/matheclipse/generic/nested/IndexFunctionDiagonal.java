package org.matheclipse.generic.nested;

import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.generic.interfaces.IIndexFunction;

/**
 * Evaluates to one of two given values. Useful for table generation.
 * 
 * @param <IExpr>
 */
public class IndexFunctionDiagonal implements IIndexFunction<IExpr> {
	final IExpr[] fValues;

	public IndexFunctionDiagonal(final IExpr[] values) {
		fValues = values;
	}

	public IExpr evaluate(final int[] index) {
		if (isMatched(index)) {
			return fValues[1];
		}
		return fValues[0];
	}

	protected boolean isMatched(final int[] index) {
		for (int i = 1; i < index.length; i++) {
			if (index[i] != index[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
