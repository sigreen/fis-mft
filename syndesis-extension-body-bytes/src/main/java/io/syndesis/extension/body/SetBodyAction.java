package io.syndesis.extension.body;

import java.util.Map;
import java.util.Optional;

import org.apache.camel.CamelContext;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.util.ObjectHelper;

import io.syndesis.extension.api.Step;
import io.syndesis.extension.api.annotations.Action;
import io.syndesis.extension.api.annotations.ConfigurationProperty;

@Action(id = "convertBody", name = "Convert Body", description = "Convert your body", tags = { "body", "extension" })
public class SetBodyAction implements Step {

	@Override
	public Optional<ProcessorDefinition> configure(CamelContext context, ProcessorDefinition route,
			Map<String, Object> parameters) {
		ObjectHelper.notNull(route, "route");
		
		route.convertBodyTo(byte[].class);
		return Optional.empty();
	}
}
