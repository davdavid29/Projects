function varargout = Finals(varargin)
% FINALS MATLAB code for Finals.fig
%      FINALS, by itself, creates a new FINALS or raises the existing
%      singleton*.
%
%      H = FINALS returns the handle to a new FINALS or the handle to
%      the existing singleton*.
%
%      FINALS('CALLBACK',hObject,eventData,handles,...) calls the local
%      function named CALLBACK in FINALS.M with the given input arguments.
%
%      FINALS('Property','Value',...) creates a new FINALS or raises the
%      existing singleton*.  Starting from the left, property value pairs are
%      applied to the GUI before Finals_OpeningFcn gets called.  An
%      unrecognized property name or invalid value makes property application
%      stop.  All inputs are passed to Finals_OpeningFcn via varargin.
%
%      *See GUI Options on GUIDE's Tools menu.  Choose "GUI allows only one
%      instance to run (singleton)".
%
% See also: GUIDE, GUIDATA, GUIHANDLES

% Edit the above text to modify the response to help Finals

% Last Modified by GUIDE v2.5 22-Dec-2021 22:23:49

% Begin initialization code - DO NOT EDIT
gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @Finals_OpeningFcn, ...
                   'gui_OutputFcn',  @Finals_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before Finals is made visible.
function Finals_OpeningFcn(hObject, eventdata, handles, varargin)
% This function has no output args, see OutputFcn.
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
% varargin   command line arguments to Finals (see VARARGIN)

% Choose default command line output for Finals
handles.output = hObject;

% Update handles structure
guidata(hObject, handles);

% UIWAIT makes Finals wait for user response (see UIRESUME)
% uiwait(handles.figure1);


% --- Outputs from this function are returned to the command line.
function varargout = Finals_OutputFcn(hObject, eventdata, handles) 
% varargout  cell array for returning output args (see VARARGOUT);
% hObject    handle to figure
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in pb1.
function pb1_Callback(hObject, eventdata, handles)
% hObject    handle to pb1 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 697;
f2 = 1209; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 1');

% --- Executes on button press in pb2.
function pb2_Callback(hObject, eventdata, handles)
% hObject    handle to pb2 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 697;
f2 = 1336; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 2');

% --- Executes on button press in pb3.
function pb3_Callback(hObject, eventdata, handles)
% hObject    handle to pb3 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 697;
f2 = 1477; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 3');

% --- Executes on button press in pbA.
function pbA_Callback(hObject, eventdata, handles)
% hObject    handle to pbA (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 697;
f2 = 1633; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is A');

% --- Executes on button press in pb4.
function pb4_Callback(hObject, eventdata, handles)
% hObject    handle to pb4 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 770;
f2 = 1209; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 4');

% --- Executes on button press in pb5.
function pb5_Callback(hObject, eventdata, handles)
% hObject    handle to pb5 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 770;
f2 = 1336; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 5');

% --- Executes on button press in pb6.
function pb6_Callback(hObject, eventdata, handles)
% hObject    handle to pb6 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 770;
f2 = 1477; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 6');

% --- Executes on button press in pbB.
function pbB_Callback(hObject, eventdata, handles)
% hObject    handle to pbB (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 770;
f2 = 1633; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is B');

% --- Executes on button press in pb7.
function pb7_Callback(hObject, eventdata, handles)
% hObject    handle to pb7 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 852;
f2 = 1209; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 7');

% --- Executes on button press in pb8.
function pb8_Callback(hObject, eventdata, handles)
% hObject    handle to pb8 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 852;
f2 = 1336; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 8');

% --- Executes on button press in pb9.
function pb9_Callback(hObject, eventdata, handles)
% hObject    handle to pb9 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 852;
f2 = 1477; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 9');

% --- Executes on button press in pbC.
function pbC_Callback(hObject, eventdata, handles)
% hObject    handle to pbC (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 852;
f2 = 1633; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is C');

% --- Executes on button press in pbasterisk.
function pbasterisk_Callback(hObject, eventdata, handles)
% hObject    handle to pbasterisk (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 941;
f2 = 1209; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is *');

% --- Executes on button press in pb0.
function pb0_Callback(hObject, eventdata, handles)
% hObject    handle to pb0 (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 941;
f2 = 1336; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is 0');

% --- Executes on button press in pbhashtag.
function pbhashtag_Callback(hObject, eventdata, handles)
% hObject    handle to pbhashtag (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 941;
f2 = 1477; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is #');

% --- Executes on button press in pbD.
function pbD_Callback(hObject, eventdata, handles)
% hObject    handle to pbD (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    structure with handles and user data (see GUIDATA)
t = [0:0.000125:.05];
fs = 8000;
f1 = 941;
f2 = 1633; 
y1 = .25*sin(2*pi*f1*t);
y2 = .25*sin(2*pi*f2*t);
y= y1+y2;
sound(y,fs);

%DTMF Input
axes(handles.axes1)
plot(t,y); grid;
title('DTMF Input', 'Color','white');
xlabel('Time', 'Color','white');
ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

n =  9; 
Rp = 0.5;
cl = 0.25; %for low freq
ch = 0.28; %for high freq
[b,a] = cheby1(n,Rp,cl);
yfilt1=filter(b,a,y);
[b1,a1]=cheby1(n,Rp,ch,'high');
yfilt2=filter(b1,a1,y);

%Filtered Low Freq. Signal
axes(handles.axes2)
plot(yfilt1); grid;
title('Low Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

%Filtered High Freq. Signal
axes(handles.axes3)
plot(yfilt2); grid;
title('Filtered High Freq. Signal', 'Color','white');
xlabel('Time', 'Color','white');ylabel('Amplitude', 'Color','white');
set(gca,'xcolor','w');
set(gca,'ycolor','w');

disp('---> Key Pressed is D');


% --- Executes during object creation, after setting all properties.
function bgimage_CreateFcn(hObject, eventdata, handles)
% hObject    handle to bgimage (see GCBO)
% eventdata  reserved - to be defined in a future version of MATLAB
% handles    empty - handles not created until after all CreateFcns called

% Hint: place code in OpeningFcn to populate bgimage
imshow('C:\Users\David\Documents\Finals__Alfonso_Aguinaldo_Estavillo\cpe166_dsp.jpg');
