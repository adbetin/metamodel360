/**
 * generated by Xtext 2.12.0
 */
package co.betinrubio;

import co.betinrubio.Dsl360StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class Dsl360StandaloneSetup extends Dsl360StandaloneSetupGenerated {
  public static void doSetup() {
    new Dsl360StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}