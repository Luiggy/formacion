mvn -Pdev package
sshpass -p 'vagrant' scp -P2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null alineaciones-portlet/target/alineaciones-portlet.war vagrant@nodo1.curso-liferay.com:/tmp
sshpass -p 'vagrant' ssh -p2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null vagrant@nodo1.curso-liferay.com 'cp /tmp/alineaciones-portlet.war /opt/liferay/deploy'
