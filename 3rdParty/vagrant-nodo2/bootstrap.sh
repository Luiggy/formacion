echo "Instalando MySQL y apache2"
sudo apt-get update
sudo apt-get -y install mysql-client-5.5 unzip sshpass

#Instalando jdk7
if [ ! -f /opt/jdk1.7 ];
then
	echo "Obteniendo JDK7..."
	cd /tmp
    	wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/7u79-b15/jdk-7u79-linux-x64.tar.gz"
	echo "Ejecutando JDK7..."
	cd /opt
	tar -zxvf /tmp/jdk-7u79-linux-x64.tar.gz

    	ln -s /opt/jdk1.7.0_79 jdk1.7
	
	touch /etc/profile.d/vagrant.sh
	echo "export JAVA_HOME=/opt/jdk1.7" >> /etc/profile.d/vagrant.sh
	echo "export PATH=\$JAVA_HOME/bin:\$PATH" >> /etc/profile.d/vagrant.sh

fi

echo "Desempaquetando el tomcat de liferay"
if [ ! -f /opt/liferay ];
then
	cd /opt
	unzip /mnt/liferay-portal-tomcat-6.2-ce-ga6-20160112152609836.zip
	mv /opt/liferay-portal-6.2-ce-ga6 liferay
fi

echo "Configurando portal-ext.properties y el datasource"
if [ ! -f /etc/init.d/liferay.sh ];
then
	cp /mnt/dev.portal-ext.properties /opt/liferay/tomcat-7.0.62/webapps/ROOT/WEB-INF/classes/portal-ext.properties
	cp /mnt/context.xml /opt/liferay/tomcat-7.0.62/conf/context.xml
	cp /mnt/undeploy-ext.sh /opt/liferay/undeploy-ext.sh

	echo "Estableciendo usuario vagrant como propietario del tomcat"
	chown -R vagrant.vagrant /opt/liferay

	echo "Instalando script de arranque"
	cp /mnt/liferay.sh /etc/init.d
	chmod a+x /etc/init.d/liferay.sh
	update-rc.d liferay.sh defaults
fi

sudo echo "192.168.1.200 data data.curso-liferay.com dev-www.curso-liferay.com" >> /etc/hosts
sudo echo "192.168.1.201 nodo1 nodo1.curso-liferay.com" >> /etc/hosts
sudo echo "192.168.1.202 nodo2 nodo2.curso-liferay.com" >> /etc/hosts
