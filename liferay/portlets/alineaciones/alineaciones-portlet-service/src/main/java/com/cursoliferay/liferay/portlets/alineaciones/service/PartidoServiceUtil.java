package com.cursoliferay.liferay.portlets.alineaciones.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Partido. This utility wraps
 * {@link com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see PartidoService
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.base.PartidoServiceBaseImpl
 * @see com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoServiceImpl
 * @generated
 */
public class PartidoServiceUtil {
    private static PartidoService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.cursoliferay.liferay.portlets.alineaciones.service.impl.PartidoServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static PartidoService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PartidoService.class.getName());

            if (invokableService instanceof PartidoService) {
                _service = (PartidoService) invokableService;
            } else {
                _service = new PartidoServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(PartidoServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PartidoService service) {
    }
}
