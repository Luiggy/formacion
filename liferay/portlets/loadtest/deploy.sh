mvn -Pdev -o package
sshpass -p 'vagrant' scp -P2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null default-ext/target/default-ext.war vagrant@nodo1.curso-liferay.com:/tmp
sshpass -p 'vagrant' ssh -p2221 -q -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null vagrant@nodo1.curso-liferay.com 'cp /tmp/default-ext.war /opt/liferay/deploy'
