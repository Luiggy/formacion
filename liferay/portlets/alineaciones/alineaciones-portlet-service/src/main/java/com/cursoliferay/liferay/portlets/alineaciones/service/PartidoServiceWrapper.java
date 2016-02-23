package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PartidoService}.
 *
 * @author Brian Wing Shun Chan
 * @see PartidoService
 * @generated
 */
public class PartidoServiceWrapper implements PartidoService,
    ServiceWrapper<PartidoService> {
    private PartidoService _partidoService;

    public PartidoServiceWrapper(PartidoService partidoService) {
        _partidoService = partidoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _partidoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _partidoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _partidoService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PartidoService getWrappedPartidoService() {
        return _partidoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPartidoService(PartidoService partidoService) {
        _partidoService = partidoService;
    }

    @Override
    public PartidoService getWrappedService() {
        return _partidoService;
    }

    @Override
    public void setWrappedService(PartidoService partidoService) {
        _partidoService = partidoService;
    }
}
