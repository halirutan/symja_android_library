package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">bitbucket.org/axelclk/symja_android_library under the tools directory</a>.</p>
 */
public interface StruveHRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 2 };

  final public static IAST RULES = List(
    IInit(StruveH, SIZES),
    // StruveH(-1/2,z_):=Sqrt(2/(Pi*z))*Sin(z)
    ISetDelayed(StruveH(CN1D2,z_),
      Times(Sqrt(Times(C2,Power(Times(Pi,z),-1))),Sin(z))),
    // StruveH(1/2,z_):=Sqrt(2/(Pi*z))*(1-Cos(z))
    ISetDelayed(StruveH(C1D2,z_),
      Times(Sqrt(Times(C2,Power(Times(Pi,z),-1))),Plus(C1,Negate(Cos(z)))))
  );
}
