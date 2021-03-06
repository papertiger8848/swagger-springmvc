package com.mangofactory.swagger.configuration;

import com.fasterxml.classmate.TypeResolver;
import com.wordnik.swagger.model.ResponseMessage;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SwaggerGlobalSettings {
    /**
     * Set of classes to exclude from spring controller request mapping methods
     * e.g HttpServletRequest, BindingResult
     */
    private Set<Class> ignorableParameterTypes;

    /**
     * Map of java primitive types to swagger specific parameter dataTypes
     */
    private Map<Class, String> parameterDataTypes;

    /**
     * Map of spring RequestMethod's to a list of http status codes and accompanying messages
     *
     * @see com.mangofactory.swagger.readers.operation.OperationResponseMessageReader
     */
    private Map<RequestMethod, List<ResponseMessage>> globalResponseMessages;
    private TypeResolver typeResolver = new TypeResolver();

    public Set<Class> getIgnorableParameterTypes() {
        return ignorableParameterTypes;
    }

    public void setIgnorableParameterTypes(Set<Class> ignorableParameterTypes) {
        this.ignorableParameterTypes = ignorableParameterTypes;
    }

    public Map<RequestMethod, List<ResponseMessage>> getGlobalResponseMessages() {
        return globalResponseMessages;
    }

    public void setGlobalResponseMessages(Map<RequestMethod, List<ResponseMessage>> globalResponseMessages) {
        this.globalResponseMessages = globalResponseMessages;
    }

    public TypeResolver getTypeResolver() {
        return typeResolver;
    }
}
