mvn -Pdev package
sshpass -p 'vagrant' scp -P2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null loadtest-portlet/target/loadtest-portlet.war vagrant@nodo1.curso-liferay.com:/tmp
sshpass -p 'vagrant' ssh -p2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null vagrant@nodo1.curso-liferay.com 'cp /tmp/loadtest-portlet.war /opt/liferay/deploy'
