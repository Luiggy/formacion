echo "Instalando MySQL y apache2"
sudo debconf-set-selections <<< 'mysql-server-5.5 mysql-server/root_password password Passw0rd'
sudo debconf-set-selections <<< 'mysql-server-5.5 mysql-server/root_password_again password Passw0rd'
sudo apt-get update
sudo apt-get -y install mysql-server-5.5 apache2 vim
sudo a2enmod proxy_ajp headers ssl

echo "Configurando las bbdd de liferay"
if [ ! -f /var/log/databasesetup ];
then
    echo "Creando bbdd para www.curso-liferay.com"
    echo "create database liferay default character set utf8" | mysql -uroot -pPassw0rd
    echo "grant all privileges on liferay.* to liferay@'localhost' identified by 'Passw0rd'" | mysql -uroot -pPassw0rd
    echo "grant all privileges on liferay.* to liferay@'%' identified by 'Passw0rd'" | mysql -uroot -pPassw0rd
    echo "flush privileges" | mysql -uroot -pPassw0rd
	
    touch /var/log/databasesetup
fi

sudo echo "192.168.1.200 data data.curso-liferay.com dev-www.curso-liferay.com" >> /etc/hosts
sudo echo "192.168.1.201 nodo1 nodo1.curso-liferay.com" >> /etc/hosts
sudo echo "192.168.1.202 nodo2 nodo2.curso-liferay.com" >> /etc/hosts
