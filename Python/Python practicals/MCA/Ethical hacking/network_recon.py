import subprocess

def run_command(cmd):
    result = subprocess.run(cmd, stdout=subprocess.PIPE, text=True)
    print(result.stdout)

print("----IP Configuration----")
run_command(["ipconfig"])   # Use 'ifconfig' in Linux

print("----Ping Test----")
run_command(["ping", "-n", "4", "google.com"])  # Use '-c 4' in Linux

print("----Active Connections----")
run_command(["netstat", "-an"])

print("----Traceroute----")
run_command(["tracert", "google.com"])  # Use 'traceroute' in Linux
