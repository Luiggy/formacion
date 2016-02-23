package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JugadorService}.
 *
 * @author Brian Wing Shun Chan
 * @see JugadorService
 * @generated
 */
public class JugadorServiceWrapper implements JugadorService,
    ServiceWrapper<JugadorService> {
    private JugadorService _jugadorService;

    public JugadorServiceWrapper(JugadorService jugadorService) {
        _jugadorService = jugadorService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _jugadorService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _jugadorService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _jugadorService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public JugadorService getWrappedJugadorService() {
        return _jugadorService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedJugadorService(JugadorService jugadorService) {
        _jugadorService = jugadorService;
    }

    @Override
    public JugadorService getWrappedService() {
        return _jugadorService;
    }

    @Override
    public void setWrappedService(JugadorService jugadorService) {
        _jugadorService = jugadorService;
    }
}
