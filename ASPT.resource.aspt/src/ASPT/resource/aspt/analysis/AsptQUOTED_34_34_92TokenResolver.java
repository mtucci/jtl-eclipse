/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPT.resource.aspt.analysis;

public class AsptQUOTED_34_34_92TokenResolver implements ASPT.resource.aspt.IAsptTokenResolver {
	
	private ASPT.resource.aspt.analysis.AsptDefaultTokenResolver defaultTokenResolver = new ASPT.resource.aspt.analysis.AsptDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "\"", "\"", "\\");
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, ASPT.resource.aspt.IAsptTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "\"", "\"", "\\");
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
