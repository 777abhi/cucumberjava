wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i google-chrome-stable_current_amd64.deb
wget https://chromedriver.storage.googleapis.com/84.0.4147.30/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
python -m SimpleHTTPServer 8000 &> /dev/null &
rm google-chrome-stable_current_amd64.deb
rm chromedriver_linux64.zip