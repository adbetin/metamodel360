/*
 * generated by Xtext 2.12.0
 */
package co.betinrubio.formatting2

import co.betinrubio.services.Dsl360GrammarAccess
import com.google.inject.Inject
import metamodel360.Panorama
import metamodel360.Proyecto
import metamodel360.Tour
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class Dsl360Formatter extends AbstractFormatter2 {
	
	@Inject extension Dsl360GrammarAccess

	def dispatch void format(Proyecto proyecto, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Tour tour : proyecto.getToures()) {
			tour.format;
		}
	}

	def dispatch void format(Tour tour, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Panorama panorama : tour.getPanoramas()) {
			panorama.format;
		}
	}
	
	// TODO: implement for Panorama, Hotspot
}
