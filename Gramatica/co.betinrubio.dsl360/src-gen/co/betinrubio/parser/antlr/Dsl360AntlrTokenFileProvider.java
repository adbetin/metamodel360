/*
 * generated by Xtext 2.12.0
 */
package co.betinrubio.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Dsl360AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co/betinrubio/parser/antlr/internal/InternalDsl360.tokens");
	}
}
